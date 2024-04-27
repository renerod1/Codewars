results = run_sql

describe :items do
   it "should return 1 item" do
    expect(results.count).to eq 1
   end
end